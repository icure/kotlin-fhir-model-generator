//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.requirements

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actual statement as markdown
 *
 * The actual statement of requirement, in markdown format.
 *
 * @param id Unique id for inter-element referencing
 * @param key Key that identifies this statement
 * @param label Short Human label for this statement
 * @param conditionality Set to true if requirements statement is conditional
 * @param requirement The actual requirement
 * @param derivedFrom Another statement this clarifies/restricts ([url#]key)
 * @param parent A larger requirement that this requirement helps to refine and enable
 */
@SerialName("RequirementsStatement")
@Serializable
public data class RequirementsStatement(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Key that identifies this statement
   */
  public val key: String? = null,
  /**
   * Short Human label for this statement
   */
  public val label: String? = null,
  public val conformance: List<String> = emptyList(),
  /**
   * Set to true if requirements statement is conditional
   */
  public val conditionality: Boolean? = null,
  /**
   * The actual requirement
   */
  public val requirement: String? = null,
  /**
   * Another statement this clarifies/restricts ([url#]key)
   */
  public val derivedFrom: String? = null,
  /**
   * A larger requirement that this requirement helps to refine and enable
   */
  public val parent: String? = null,
  public val satisfiedBy: List<String> = emptyList(),
  public val reference: List<String> = emptyList(),
  public val source: List<Reference> = emptyList(),
) : BackboneElement
