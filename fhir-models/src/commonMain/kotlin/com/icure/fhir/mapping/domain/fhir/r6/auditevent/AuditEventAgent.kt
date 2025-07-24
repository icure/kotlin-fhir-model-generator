//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.auditevent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param requestor Whether user is initiator
 * @param location The agent location when the event occurred
 * @param networkReference This agent network location for the activity
 * @param networkUri This agent network location for the activity
 * @param networkString This agent network location for the activity
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
  public val who: Reference,
  /**
   * Whether user is initiator
   */
  public val requestor: Boolean? = null,
  /**
   * The agent location when the event occurred
   */
  public val location: Reference? = null,
  public val policy: List<String> = emptyList(),
  /**
   * This agent network location for the activity
   */
  public val networkReference: Reference? = null,
  /**
   * This agent network location for the activity
   */
  public val networkUri: String? = null,
  /**
   * This agent network location for the activity
   */
  public val networkString: String? = null,
  public val authorization: List<CodeableConcept> = emptyList(),
) : BackboneElement
