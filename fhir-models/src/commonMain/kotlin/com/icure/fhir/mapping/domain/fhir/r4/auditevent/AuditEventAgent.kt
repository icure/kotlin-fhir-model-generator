//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.auditevent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actor involved in the event
 *
 * An actor taking an active role in the event or activity that is logged.
 *
 * @param id Unique id for inter-element referencing
 * @param type How agent participated
 * @param who Identifier of who
 * @param altId Alternative User identity
 * @param name Human friendly name for the agent
 * @param requestor Whether user is initiator
 * @param location Where
 * @param media Type of media
 * @param network Logical network location for application activity
 */
@SerialName("AuditEventAgent")
@Serializable
public data class AuditEventAgent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * How agent participated
   */
  public val type: CodeableConcept? = null,
  public val role: List<CodeableConcept> = emptyList(),
  /**
   * Identifier of who
   */
  public val who: Reference? = null,
  /**
   * Alternative User identity
   */
  public val altId: String? = null,
  /**
   * Human friendly name for the agent
   */
  public val name: String? = null,
  /**
   * Whether user is initiator
   */
  public val requestor: Boolean? = null,
  /**
   * Where
   */
  public val location: Reference? = null,
  public val policy: List<String> = emptyList(),
  /**
   * Type of media
   */
  public val media: Coding? = null,
  /**
   * Logical network location for application activity
   */
  public val network: AuditEventAgentNetwork? = null,
  public val purposeOfUse: List<CodeableConcept> = emptyList(),
) : BackboneElement
