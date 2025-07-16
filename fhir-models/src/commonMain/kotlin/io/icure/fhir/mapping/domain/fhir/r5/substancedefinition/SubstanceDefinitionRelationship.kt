//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A link between this substance and another
 *
 * A link between this substance and another, with details of the relationship.
 *
 * @param id Unique id for inter-element referencing
 * @param substanceDefinitionReference A pointer to another substance, as a resource or a
 * representational code
 * @param substanceDefinitionCodeableConcept A pointer to another substance, as a resource or a
 * representational code
 * @param type For example "salt to parent", "active moiety"
 * @param isDefining For example where an enzyme strongly bonds with a particular substance, this is
 * a defining relationship for that enzyme, out of several possible relationships
 * @param amountQuantity A numeric factor for the relationship, e.g. that a substance salt has some
 * percentage of active substance in relation to some other
 * @param amountRatio A numeric factor for the relationship, e.g. that a substance salt has some
 * percentage of active substance in relation to some other
 * @param amountString A numeric factor for the relationship, e.g. that a substance salt has some
 * percentage of active substance in relation to some other
 * @param ratioHighLimitAmount For use when the numeric has an uncertain range
 * @param comparator An operator for the amount, for example "average", "approximately", "less than"
 */
@SerialName("SubstanceDefinitionRelationship")
@Serializable
public data class SubstanceDefinitionRelationship(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A pointer to another substance, as a resource or a representational code
   */
  public val substanceDefinitionReference: Reference? = null,
  /**
   * A pointer to another substance, as a resource or a representational code
   */
  public val substanceDefinitionCodeableConcept: CodeableConcept? = null,
  /**
   * For example "salt to parent", "active moiety"
   */
  public val type: CodeableConcept,
  /**
   * For example where an enzyme strongly bonds with a particular substance, this is a defining
   * relationship for that enzyme, out of several possible relationships
   */
  public val isDefining: Boolean? = null,
  /**
   * A numeric factor for the relationship, e.g. that a substance salt has some percentage of active
   * substance in relation to some other
   */
  public val amountQuantity: Quantity? = null,
  /**
   * A numeric factor for the relationship, e.g. that a substance salt has some percentage of active
   * substance in relation to some other
   */
  public val amountRatio: Ratio? = null,
  /**
   * A numeric factor for the relationship, e.g. that a substance salt has some percentage of active
   * substance in relation to some other
   */
  public val amountString: String? = null,
  /**
   * For use when the numeric has an uncertain range
   */
  public val ratioHighLimitAmount: Ratio? = null,
  /**
   * An operator for the amount, for example "average", "approximately", "less than"
   */
  public val comparator: CodeableConcept? = null,
  public val source: List<Reference> = emptyList(),
) : BackboneElement
